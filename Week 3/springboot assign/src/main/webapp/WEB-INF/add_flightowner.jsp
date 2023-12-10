<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add FlightOwner</title>
</head>
<body>
 <h1 style="color:purple">welcome to FlightOwner form</h1>
 <form action="http://localhost:8080/flightowner/add" method="post">
	 FID: <input type="number" name="flightOwnerId"> <br/>
	 FPASS: <input type="text" name="flightOwnerPassword"> <br/>
	 FNAME: <input type="text" name="flightOwnerName"> <br/>
	 FCONTACT: <input type="text" name="flightOwnerContact"> <br/>
	 FEMAIL: <input type="text" name="flightOwnerEmail"> <br/>
	 
	 <button type="submit">ADD</button>
	 
 </form>
</body>
</html>