<?php

echo "<html lang='en'>
<head>
    <style>
        body {
            background: #ddd;
            background: linear-gradient(#ddd, #e8e8e8);
            font-family: 'Open Sans', sans-serif;
            height: 100vh;
            margin:0;
            padding: 0;
        }

        .image {
            width: 400px;
            height: 300px;
            margin: 100px auto;
            perspective: 1000px;
        }

        .image a {
            display: block;
            width: 100%;
            height: 100%;
            background: linear-gradient(rgba(0, 0, 0, 0.4), rgba(0, 0, 0, 0.4)), url(img.jpg);
            background-size: 0, cover;
            transform-style: preserve-3d;
            transition: all 0.5s;
        }

        .image:hover a {
            transform: rotateX(80deg);
            transform-origin: bottom;
        }
        .image a::after {
            content: '';
            position: absolute;
            left: 0;
            bottom: 0;
            width: 100%;
            height: 38px;
            background: inherit;
            background-size: cover,cover;
            background-position: bottom;
            transform-origin: bottom;
            transform: rotateX(90deg);
        }
        .image a:before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0,0,0,.5);
            box-shadow: 0 0 100px 50px rgba(0,0,0,.5);
            opacity: 0.15;
            transition: all 0.5s;
            transform: rotateX(95deg) translateZ(-80px) scale(0.75);
            transform-origin: bottom;
        }
        .image:hover a:before {
            opacity: 1;
            box-shadow: 0 0 25px 25px rgba(0,0,0,.5);
            transform: rotateX(0) translateZ(-60px) scale(0.85);
        }
    </style>
    <title>3D Image Hover Effect</title>
</head>
<body>
     <div class='image'>
         <a href='#'></a>
     </div>
</body>
</html>";

?>
