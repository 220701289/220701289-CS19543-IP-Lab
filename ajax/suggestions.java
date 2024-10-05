<!DOCTYPE html>
<html>
<head>
    <title>Student Name Suggestion</title>
    <style>
    .con{
    background-color:grey;
    justify-content:center;
    text-align:center;
    width:200px;
    height:350px;
    margin-left:600px;
    margin-top:150px;
    padding:50px;
    }  
    </style>
    <script>
        function suggestions(str) {
            if (str.length === 0) {
                document.getElementById("suggestions").innerHTML = "";
                return;
            }
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    document.getElementById("sug").innerHTML = this.responseText;
                }
            };
            xhr.open("GET", "StudentSuggestionServlet?query=" + str, true);
            xhr.send();
        }
    </script>
</head>
<body>
<div class="con">
    <h2>Student Name Suggestion</h2>
    <input type="text" onkeyup="suggestions(this.value)" placeholder="Enter student name" />
    <div id="sug"></div>
</div>
</body>
</html>