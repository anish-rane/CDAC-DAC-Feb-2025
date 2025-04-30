function fetchData(url, callback) {
    setTimeout(() => {
        const error = Math.random() > 0.8; 

        if (error) {
            callback('Error during data fetch', null);
        } else {
            const data = `Response from ${url}`;
            callback(null, data);
        }
    }, 5000); 
}


fetchData("https://bootstrapmade.com/", (err, response) => {
    if (err) {
        console.error(err); 
    } else {
        console.log(response); 
    }
});