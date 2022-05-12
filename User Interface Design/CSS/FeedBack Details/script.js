var feedbackArr = [];

function addFeedback(){
 //Fill the required logic
    var feedBackText = document.getElementById('feedback').value;
    feedbackArr.push(feedBackText);
    document.getElementById('result').style.display = "block";
    document.getElementById('result').innerHTML+="<h2>Feedback Details</h2>Successfully Added Feedback Details!";
    feedBackText.value = "";
}

function displayFeedback(){
    //Fill the required logic
    document.getElementById('result').innerHTML="";
    document.getElementById('result').innerHTML+="<h2>Feedback Details</h2>";
    for (var i=0;i<feedbackArr.length;i++){
        document.getElementById('result').innerHTML+="Feedback "+(i+1)+"<br>"+feedbackArr[i]+"<br>";
    }
}
