console.log("Process Started..");
const myPromise =new Promise((resolve,rejected)=>{
    setTimeout(()=>{
      resolve();  
    },3000);
    setTimeout(()=>{
        rejected();
    },2000);
});
console.log(myPromise);
console.log("program in progress....");
myPromise.then(()=>{
    console.log("program in completed");
}).catch(()=>{
    console.log("program in failed");
})