var gameArea = document.getElementById('game');
const SCALE = 0.45;
const WIDTH = 640;
const HEIGHT = 600;
const SCALED_WIDTH = SCALE * WIDTH;
const SCALED_HEIGHT = SCALE * HEIGHT;
const CYCLE_LOOP = [0, 1, 2, 3];
const FACING_DOWN = 2;
const FACING_UP = 1;
const FACING_LEFT = 0;
const FACING_RIGHT = 0;

//to determine speed later on
const FRAME_LIMIT =10;
const MOVEMENT_SPEED = 1;

//canvas variables
const canWidth = 600;
const canHeight = 750;


//lettuce variable
var spriteWidth=320;
var spriteHeight=300;
var width = spriteWidth; 		
var height = spriteHeight; 
var curFrame = 0; 
var x=300;
var y=400; 
var srcX=0; 
var srcY=0; 
//var speed = 10; 

let canvas = document.querySelector("canvas");
let ctx = canvas.getContext("2d");

// ctx.font = 'italic 40pt Calibri';
// ctx.fillStyle = "black";
// ctx.fillText('Hello World',50,50);
//   //text("Score: "+ Score,20,20);

let keyPresses = {};
let currentDirection = FACING_RIGHT;
let currentLoopIndex = 0;
let frameCount = 0;
let positionX = 0;
let positionY = 0;

let positionLett = 0;

let img = new Image();
canvas.width = canWidth;
canvas.height = canHeight;

//lettuce image 
var lettuce = new Image();  
lettuce.src = "images/lettuce.png";

//eagle image
var eagle = new Image();  
eagle.src = "images/$euphus.png";


//lettuce2
var lettuce2=new Image();
lettuce2.src="images/lettuce2.png";


//sound mp3
var sound = new Audio('sound/jump.mp3');

var bgSound = new Audio('sound/bg.mp3');

var coinSound = new Audio('sound/coin.wav');

var kick = new Audio('sound/kick.mp3');

//trunk
var trunk=new Image();
trunk.src="images/trunk3.png";

window.addEventListener('keydown', keyDownListener);
function keyDownListener(event) {
    keyPresses[event.key] = true;
}

window.addEventListener('keyup', keyUpListener);
function keyUpListener(event) {
    keyPresses[event.key] = false;
}

function loadImage() {
  img.src = "images/tortoise1.png";
  img.onload = function() {
    window.requestAnimationFrame(gameLoop);
  };
}

function drawFrame(frameX, frameY, canvasX, canvasY) {
  ctx.drawImage(img,
                frameX * WIDTH, frameY * HEIGHT, WIDTH, HEIGHT,
                canvasX, canvasY, SCALED_WIDTH/2.5, SCALED_HEIGHT);
  
}


//variable eagle
var spriteWidthE = 500; 
var spriteHeightE = 667;
var rowsE = 4;
var colsE = 3;
var widthE = spriteWidthE/colsE; 
var heightE = spriteHeightE/rowsE; 
var curFrameE = 0; 
var frameCountE = 3;
var xE=300;
var yE=0; 
var srcxE=0; 
var srcyE=0;
//var speedE = 5;

//trunk
var spriteWidthT=620;
var spriteHeightT=607;
var colT=1;
var rowT=1;
var widthT = spriteWidthT/colT; 
var heightT = spriteHeightT/rowT;
var currentframeT=1;
var framecountT=1;
var xT=500;
var yT=575;
var srcXT=0;
var srcYT=0;

//lettuce2
var spriteWidthL=320;
var spriteHeightL=300;
var colL=1;
var rowL=1;
var widthL = spriteWidthL/colL; 
var heightL = spriteHeightL/rowL;
var currentframeL=1;
var framecountL=1;
var xL=600;
var yL=500;
var srcXL=0;
var srcYL=0;

var currentLives = 3

var score = 0;
// function score(){
//    ctx.font = "16px Arial";
//     ctx.fillStyle = "#0095DD";
//     ctx.fillText("Score: "+score, 8, 20);

// }


function updateFrame(){
	ctx.clearRect(xE,yE,widthE,heightE);
				curFrameE = ++curFrameE % frameCountE; 				
				srcxE = curFrameE * widthE; 
				
				//srcyE = 0 * heightE; 
					// xE+=speedE;}
					xE-=2;
  //positionX+90 && keyPresses.w
			  if(xE< 0)	{
			    xE=550;
          // currentLives--;
          // if (currentLives <=0){
          //   currentLives =0;
          // window.location.href=("gameover.html");
  }   
     }

			 // }
			

     
function draw(){
	

	ctx.drawImage(lettuce,srcX,srcY,width,height,x,y-10,width/8,height/4); // draw lettuce
	
	ctx.drawImage(trunk,srcXT,srcYT,widthT,heightT,xT,yT,widthT/20,heightT/20);//draw trunk
	
 
  ctx.drawImage(lettuce,srcXL,srcYL,widthL,heightL,xL,yL,widthL/8,heightL/4);//draw lettuce 2


	updateFrame();
	ctx.drawImage(eagle,srcxE,srcyE,widthE,heightE,xE,yE+300,widthE/2,heightE); // draw eagle

  ctx.font="20px Comic Sans MS";
  ctx.fillStyle='#FFFFFF';

  ctx.fillText('Score:'+ score,350,50,);
  
   ctx.fillText('Lives:'+ currentLives,450,50,);
 

}
// setInterval(draw,100);
// ctx.font="20px Comic Sans MS";
//   ctx.fillText('Score:'+ score,350,50,);
 
loadImage();

function collisionDetection(){

  if(((xT < positionX+90 && !keyPresses.w) && (xT > positionX)) || ((xT < positionX&& !keyPresses.w) && xT>positionX-2)){
    xT-=90;
   kick.play();
   currentLives--;
  if (currentLives <=0){
  currentLives =0;
  window.location.href=("gameover.html");}
  }
}

function collisionEagle(){
        if(((xE< positionX+90 && keyPresses.w) && (xE>positionX && keyPresses.w))||((xE<positionX && keyPresses.w)&&(xE>positionX-2 && keyPresses.w))) {
          xE-=90;
          kick.play();
          currentLives--;
          if (currentLives <=0){
          currentLives =0;
          window.location.href=("gameover.html");}



}}

function gameLoop() {
  
collisionEagle();
collisionDetection();
  ctx.clearRect(0, 0, canvas.width, canvas.height); //tortoise
  
  ctx.clearRect(x,y,width,height); // rock
  //ctx.clearRect(xE,yE,widthE,heightE); // eagle
  srcX = curFrame * width; 
  updateFrame();
  //srcxE = curFrameE * widthE;


  x-=2;

  if(x< positionX+90 && keyPresses.w){
    x=600;
    sumScore();
    coinSound.play();
    
  }

xL-=2;
if(xL< positionX+90 && !keyPresses.w){
	xL=600;
  sumScore();
  coinSound.play();
 
}
  xT-=4;
   // positionX+90 && !keyPresses.w || xT < positionX && keyPresses.d)
  if(xT <	0){
    xT=660;
    // currentLives--;
    //       if (currentLives <=0){
    //         currentLives =0;
    // window.location.href=("gameover.html");
  }
//}

  window.onload = bgSound.play();

  if(keyPresses.w){
    sound.play();
  }



  let hasMoved = false;

  if (keyPresses.w) {
    moveCharacter(MOVEMENT_SPEED,0, FACING_UP);
    hasMoved = true;
    console.log(positionY);

  } else if (keyPresses.s) {
    moveCharacter(MOVEMENT_SPEED,0, FACING_DOWN);
    hasMoved = true;
  }

  if (keyPresses.a) {
    moveCharacter(-MOVEMENT_SPEED, 0, FACING_LEFT);
    hasMoved = true;

  } else if (keyPresses.d) {
    moveCharacter(MOVEMENT_SPEED, 0, FACING_RIGHT);
    hasMoved = true;
  }

  if (hasMoved) {
    frameCount++;
    if (frameCount >= FRAME_LIMIT) {
      frameCount = 0;
      currentLoopIndex++;
      if (currentLoopIndex >= CYCLE_LOOP.length) {
        currentLoopIndex = 0;
      }
    }
  }

  if (!hasMoved) {
    currentLoopIndex = 0;
  }

  drawFrame(CYCLE_LOOP[currentLoopIndex], currentDirection, positionX, positionY+350);
  draw(); //call draw function to draw new position of lettuce and eagle
  window.requestAnimationFrame(gameLoop);

}

function moveCharacter(deltaX, deltaY, direction) {
 
  if (positionX + deltaX > 0 && positionX + SCALED_WIDTH+200 + deltaX < canvas.width) {
    positionX += deltaX;
  }
  if (positionY + deltaY > 0 && positionY + SCALED_HEIGHT + deltaY < canvas.height) {
    positionY += deltaY;
    
  }
  
  currentDirection = direction;
   

}

function sumScore(){

  score += 1;
  document.getElementById("txtscore").defaultValue = score;
}


// setInterval(function(){
//   draw();
// },100);
