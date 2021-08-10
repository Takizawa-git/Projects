function work()
		{
			let fname=document.getElementById("fname").value;
			let lname=document.getElementById("lname").value;
			let email=document.getElementById("email").value;
			let phone=document.getElementById("phone").value;
			let address=document.getElementById("address").value;
			let message=document.getElementById("message").value;

			if(fname==""){
				alert("Please fill up the form completely.Thank you.")
			}
			else if(lname==""){
				alert("Please fill up the form completely.Thank you.")
			}

			else if(email==""){
				alert("Please fill up the form completely.Thank you.")
			}
			else if(phone==""){
				alert("Please fill up the form completely.Thank you.")
			}
			else if(address==""){
				alert("Please fill up the form completely.Thank you.")
			}
			else if(message==""){
				alert("Please fill up the form completely.Thank you.")
			}
			else{
				alert("Congratulations, you have sucessfully filled up the form.")
			}
		}