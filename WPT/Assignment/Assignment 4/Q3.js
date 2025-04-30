function fetchData(url,call){
    setTimeout(()=>{
        let a= "Going to "+url;
        call(a);
    },10000);
}
fetchData("https://bootstrapmade.com/",(Response)=>{
    console.log(Response);
});