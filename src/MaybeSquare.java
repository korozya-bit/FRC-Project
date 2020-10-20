public class MaybeSquare{
    public static int maybeSquare(int num, boolean square){
        if (square) {
            return num * num;
        }
        else {
            return num;
        }
    }
}
