public class Main {

    public static void main(String[] args) {

        GameArena arena = new GameArena(500, 500);
        Controller player = new Controller(arena);
        Breaker ball = new Breaker(arena, player);
        Blocks targets = new Blocks(arena, player);


        while (true) {
            if ((arena.leftPressed()) && (player.getPosX() > 0)) {
                player.moveLeft();
            }
            if ((arena.rightPressed()) && (player.getPosX() < arena.getWidth() - player.getControllerWidth())) {
                player.moveRight();
            }
            arena.pause();
        }
    }
}
