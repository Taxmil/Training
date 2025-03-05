document.addEventListener("DOMContentLoaded", () => {
    loadProgressChart();
});

function loadProgressChart() {
    const ctx = document.getElementById("progressChart").getContext("2d");

    let routines = JSON.parse(localStorage.getItem("routines")) || [];
    let routineNames = routines.map(routine => routine.name);
    let exerciseCounts = routines.map(routine => routine.exercises.length);

    new Chart(ctx, {
        type: "bar",
        data: {
            labels: routineNames,
            datasets: [{
                label: "Number of Exercises",
                data: exerciseCounts,
                backgroundColor: "rgba(0, 123, 255, 0.6)",
                borderColor: "rgba(0, 123, 255, 1)",
                borderWidth: 1
            }]
        },
        options: {
            responsive: true,
            scales: {
                y: { beginAtZero: true }
            }
        }
    });
}
