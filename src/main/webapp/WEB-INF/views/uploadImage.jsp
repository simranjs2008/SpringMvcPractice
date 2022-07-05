<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File upload</title>


</head>
<body>
	<div>
		<h1>Upload Image</h1>
		<form method="post" enctype="multipart/form-data" action="processimage">
			<input type="file" class="file" name="fname"> 
			<input type="submit" value="Upload">
		</form>
	</div>
</body>
</html>