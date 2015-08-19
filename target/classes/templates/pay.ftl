<!DOCTYPE html>
<html>
<head>
	<title>ThaosCoffee</title>
	
	<script language="javascript" type="text/javascript">
        function printDiv(divID) {
            //Get the HTML of div
            var divElements = document.getElementById(divID).innerHTML; 
            //Get the HTML of whole page
            var oldPage = document.body.innerHTML;
            
            //Reset the page's HTML with div's HTML only
            document.body.innerHTML = "<html><head><title></title></head><body>" + divElements + "</body>";
            
            //Print Page
            window.print();
            
            //Restore orignal HTML
            document.body.innerHTML = oldPage;
            
            //disable postback on print button
            return false;
        }
    </script>
</head>

<body>
	<div align="center">
	<a href="/">Home page</a>
	<a href="/custommer">Oder page</a>
	<h1>Thank you!</h1>
	<h3>Vui lòng thanh toán ${custommer.money}$.</h3> <br/>
	Cảm ơn quý khách đã sử đã sử dụng dịch vụ của ThaosCoffee, chúc quý khách ngon miệng. <br/> <br/>
	<input type="button" onClick="printDiv('bill')" value="Print Bill" /> <br/> <br/> 
	
	<div id="bill" style="display: none;">
		<div id="logo">
    		<a href="http://www.danifer.com/"><img src="http://www.danifer.com/images/invoice_logo.jpg"></a>
  		</div><!--end logo-->
		
  		<div id="address">
    		<p>ThaosCoffee<br />
    		<a href="truong.pham@NTQ-soulution.com.vn">truong.pham@NTQ-soulution.com.vn</a>
    		<br /><br />
    		Transaction # xxx<br />
    		</p>
  		</div><!--end address-->

  <div id="content">
    <p>
      <strong>Customer Details</strong><br />
      Name: ${custommer.name}<br />
      Phone: ${custommer.phoneNumber}<br />
      Address: ${custommer.address}    </p>
    <hr>
    <table>
      <tr><td><strong>Description</strong></td><td><strong>Quantity</strong></td><td><strong>Unit Price</strong></td><td><strong>Amount</strong></td></tr>
      
	 <#list custommer.oderList.coffeeOders as coffeeOder>
        <tr>
            <td >${coffeeOder.coffee.name}</td>
            <td >${coffeeOder.quantity}</td>
            <td >${coffeeOder.coffee.price}$</td>
            <td >${coffeeOder.money}$</td>
        </tr>
    </#list>
    <#list custommer.oderList.spicesOders as spicesOder>
        <tr>
            <td >${spicesOder.spices.name}</td>
            <td >${spicesOder.quantity}</td>
            <td >${spicesOder.spices.price}$</td>
            <td >${spicesOder.money}$</td>
        </tr>
    </#list>

	<tr><td>&nbsp;</td><td>&nbsp;</td><td><strong>Total</strong></td><td><strong>${custommer.money}$</strong></td></tr>

    </table>
    <hr>
    <p>
      Thank you for your order!  This transaction will appear on your billing statement as "Your Company".<br />
      If you have any questions, please feel free to contact us at <a href="truong.pham@NTQ-solution.com.vn">truong.pham@NTQ-solution.com.vn</a>.
    </p>

    <hr>
    <p>
      <center><small> Coffee change the world!
      <br /><br />
      &copy; NTQ-solution All Rights Reserved
      </small></center>
    </p>
  </div><!--end content-->
</div><!--end page-->
	
	</div>
</body>

</html>