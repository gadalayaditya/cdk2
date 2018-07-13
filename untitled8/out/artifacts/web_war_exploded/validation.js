/**
 * Created by gadalaya on 7/20/2017.
 */


    function enableDisable(bEnable, textBoxID)
    {
        document.getElementById(textBoxID).disabled = !bEnable
    }
    function dovalid() {
        var name=document.forms["myform"]["name"].value;
        var password=document.forms["myform"]["pass1"].value;
        var id=document.forms["myform"]["id"].value;
        var password2=document.forms["myform"]["pass2"].value;
        var phno=document.forms["myform"]["textbox"].value;
        var letters = /^[A-Za-z]+$/;

        if (name==null || name==""||password==null || password==""||id==null || id==""){
            alert("first four fields can't be blank");
            return false;
        }else if(password.length<5){
            alert("Password must be at least 5 characters long.");
            return false;
        }
        else if(password != password2) {
            alert("Passwords aren't matching.");
            return false;
        }

        else if(!name.match(letters)) {
            alert("name cant be a number.");
            return false;
        }else if(document.forms["myform"]["checkBox"].checked) {
            if(phno==null || phno == "")
            {   alert("enter no. or uncheck the checkbox");
            return false;}
        }
        else {

            return true;
        }
    }