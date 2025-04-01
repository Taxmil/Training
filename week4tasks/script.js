document.addEventListener("DOMContentLoaded", () => {
    loadRoutines();
});

function addExercise() {
    const exerciseName = document.getElementById("exerciseName").value;
    const exerciseDuration = document.getElementById("exerciseDuration").value;
    const exerciseList = document.getElementById("exerciseList");

    if (exerciseName === "" || exerciseDuration === "") return alert("Enter details!");

    const li = document.createElement("li");
    li.textContent = `${exerciseName} - ${exerciseDuration} min`;

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "❌";
    deleteBtn.onclick = () => li.remove();
    li.appendChild(deleteBtn);

    exerciseList.appendChild(li);
}

function saveRoutine() {
    const routineName = document.getElementById("routineName").value;
    const exerciseList = document.getElementById("exerciseList").children;

    if (!routineName || exerciseList.length === 0) return alert("Enter routine name and exercises!");

    let exercises = [...exerciseList].map(li => li.textContent.replace("❌", "").trim());

    let routines = JSON.parse(localStorage.getItem("routines")) || [];
    routines.push({ name: routineName, exercises });
    localStorage.setItem("routines", JSON.stringify(routines));
    alert("Routine saved!");
}
document.addEventListener("DOMContentLoaded", () => {
    loadRoutines();
});

function addExercise() {
    const exerciseName = document.getElementById("exerciseName").value;
    const exerciseDuration = document.getElementById("exerciseDuration").value;
    const exerciseList = document.getElementById("exerciseList");

    if (exerciseName === "" || exerciseDuration === "") return alert("Enter details!");

    const li = document.createElement("li");
    li.textContent = `${exerciseName} - ${exerciseDuration} min`;

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "❌";
    deleteBtn.onclick = () => li.remove();
    li.appendChild(deleteBtn);

    exerciseList.appendChild(li);
}

function saveRoutine() {
    const routineName = document.getElementById("routineName").value;
    const exerciseList = document.getElementById("exerciseList").children;

    if (!routineName || exerciseList.length === 0) return alert("Enter routine name and exercises!");

    let exercises = [...exerciseList].map(li => li.textContent.replace("❌", "").trim());

    let routines = JSON.parse(localStorage.getItem("routines")) || [];
    routines.push({ name: routineName, exercises });
    localStorage.setItem("routines", JSON.stringify(routines));
    alert("Routine saved!");
}
