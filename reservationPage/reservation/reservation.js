"use strict";
$(document).ready(function () {
	$("#arrival_date").focus();
	$("#reservation_form").submit(function (event) {
		let isValid = true;
		let arrival = $("#arrival_date").val().trim();
		let nights = $("#nights").val();
		let name = $("#name").val().trim();
		let phone = $("#phone").val().trim();



		// validate the email entry with a regular expression 
		let emailPattern = /\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}\b/;
		let email = $("#email").val().trim().toLowerCase();
		if (email === "") {
			$("#email").next().text("This field is required.");
			isValid = false;
			event.preventDefault();
		} else if (!emailPattern.test(email)) {
			$("#email").next().text("Must be a valid email address.");
			isValid = false;
			event.preventDefault();
		} else {
			$("#email").next().text("");
		}
		$("#email").val(email);

		//validate arrival date:
		if (arrival === "") {
			$("#arrival_date").next().text("Arrival Date is required.");
			isValid = false;
			event.preventDefault();
		}
		else {
			$("#arrival_date").next().text("");
		}
		$("#arrival_date").val(arrival);


		if (nights === "") {
			$("#nights").next().text("Number of Nights is required.");
			isValid = false;
			event.preventDefault();
		}
		//changed input to "number" instead of "text" - negating this validation.
		// else if (isNaN(nights)) {
		// 	$("#nights").next().text("Must be a number.");
		// 	isValid = false;
		// 	event.preventDefault();
		// }

		else if (nights < 1) {
			$("#nights").next().text("Stay must be greater than 0.");
			isValid = false;
			event.preventDefault();
		}

		else {
			$("#nights").next().text("");
		}
		$("#nights").val(nights);

		if (name === "") {
			$("#name").next().text("Name is required.");
			isValid = false;
			event.preventDefault();
		}
		else {
			$("#name").next().text("");
		}
		$("#name").val(name);

		if (phone === "") {
			$("#phone").next().text("Phone is required.");
			isValid = false;
			event.preventDefault();
		}
		else {
			("#phone").next().text("");
		}
		$("#phone").val(phone);

	});//end of submit
});//end of function
