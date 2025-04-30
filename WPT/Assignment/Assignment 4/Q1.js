function processData(str,Upper){
    console.log(Upper(str));
}
function toUpperCase(str){
    return str.toUpperCase();
}
processData("hello Manish",toUpperCase);