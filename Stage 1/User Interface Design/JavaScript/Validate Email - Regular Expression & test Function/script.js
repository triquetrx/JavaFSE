function validateEmail(email) {
   //fill the code
   let pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if(email.match(pattern)){
        return 'Valid email address!';
    }
    else{
        return 'Invalid email address!';
    }
}

