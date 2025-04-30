function forEachElement(arr,call){
    for(let i=0;i<arr.length;i++){
        call(arr[i],i)
    }
}

forEachElement([1,2,3,4,5,6,7,8],(value,index)=>{
    console.log(index,value*2);
});
