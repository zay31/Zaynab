<!DOCTYPE html>
<html>
	<head></head>
	<body>
		<div>
		<form name="FrmCurrency" action="ExSoap.php" method="GET">
			<table>
				<tr>
					
			<input type="string" name="amount" placeholder="Enter amount" />
			</tr>
			<tr>		
			<button class="btn w-xs btn-primary" type="submit" onclick="soap();"><strong>Convert</strong></button>
		</tr>
			
	</table>
		</form>
		<div id="result">


		</div>


		<script>
			function soap(){
				var envelop =new XMLHttpRequest();

				 amount = document.FrmCurrency.amount.value;

				envelop.onreadystatechange = function(){

					if (this.readyreadyState==4 && this.status==200){
						document.getElementById("result").innerHTML = this.responseText;
					}
					
				};
				envelop.open("GET","ExSoap.php?amount=" + amount,true);
				envelop.send();
			}
		</script>
	</div>
	</body>


</html>

