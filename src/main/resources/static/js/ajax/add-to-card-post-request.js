$(document).ready(
		function() {
			// SUBMIT FORM
			$("form.addToCardForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				var data = getFormData($(this).serializeArray());
				console.log("add to card");
				ajaxAddToCardPost(data);
			});

			$("#paymentForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				addPaymentDetails();
				console.log("test ");
			});

			function addPaymentDetails() {
				var form = $('#paymentForm')[0];
				var dataForm = new FormData(form);
				$.ajax({
					type : "POST",
					url : window.location.origin + "/api/add-cart-payment",
					data : dataForm,
					cache : false,
					dataType : "json",
					contentType : false,
					processData : false,
					success : function(result) {
						if (result.status == "Done") {
							alert("Done : "+JSON.stringify(result.data));
						} else {
							alert("Error!")
						}
						console.log(result);
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});
				// console.log(JSON.stringify(formData));
			}

		});