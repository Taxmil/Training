 let price=[50,60,40,60,70,55,65];
 let total=0;
for (let i=0; i<=7;i++){
    total=total+price[i]
}
console.log(total)
if ((total/7)<50){
    console.log("Tomato has given profit")
}
else{
    console.log("no profit from tomato")
}
