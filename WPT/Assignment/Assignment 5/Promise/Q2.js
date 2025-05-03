console.log("Program startes");
const myPromise= new Promise((resolve)=>{
    setTimeout(()=>{
        resolve();
    },3000)
});
console.log(myPromise);
console.log("program in progress.....");
myPromise.then(()=>{
    console.log("Step one completed");
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("Step 2 completed");
        },3000);
    });
}).then((val)=>{
    console.log(val);
});