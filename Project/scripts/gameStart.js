import canvas from "./canvas.js";
import gameLoop from "./gameLoop.js";
import snake from "./snake.js";
import score from "./score.js";
import food from "./food.js";


class GameStart {

    constructor(container){
        this.canvas = new canvas(container);
        this.snake = new snake();
        this.food = new food(this.canvas);
        this.score = new score(".game-score .score-count", 0)
        new gameLoop(this.update.bind(this), this.draw.bind(this));
    }

    update(){
        this.snake.update(this.food, this.score, this.canvas);
    }

    draw(){
        this.canvas.context.clearRect(0, 0, this.canvas.element.width, this.canvas.element.height);

        this.snake.draw(this.canvas.context);
        this.food.draw(this.canvas.context);
    }


}
new GameStart( document.querySelector(".canvas-wrapper") );