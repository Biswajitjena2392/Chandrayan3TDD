package tdd.cyaan3;

public class Chandrayaan3 {
    private static int x_coordinate=0;
    private static int y_coordinate=0;
    private static int z_coordinate=0;

    public static int[] coordinates={x_coordinate,y_coordinate,z_coordinate};
    private static char directionFacing='N';
    private static char prevDirection='N';
    public static int[] finalPosition(String[] commands){
        int[] coords=coordinates;
        for(String str:commands){
            String command=str.toLowerCase();
            directionFacing=setDirection(directionFacing,prevDirection,command);
            if(command.equals("f")){
                if(directionFacing=='N')
                    coords[1]++;
                if(directionFacing=='S')
                    coords[1]--;
                if(directionFacing=='W')
                    coords[0]--;
                if(directionFacing=='E')
                    coords[0]++;
                if(directionFacing=='U')
                    coords[2]++;
                if(directionFacing=='D')
                    coords[2]--;
            }
            if(command.equals("b")){
                if(directionFacing=='N')
                    coords[1]--;
                if(directionFacing=='S')
                    coords[1]++;
                if(directionFacing=='W')
                    coords[0]++;
                if(directionFacing=='E')
                    coords[0]--;
                if(directionFacing=='U')
                    coords[2]--;
                if(directionFacing=='D')
                    coords[2]++;
            }
            if(command.equals("l")){
                directionFacing=setDirection(directionFacing,prevDirection,command);
            }
            if(command.equals("r")){
                directionFacing=setDirection(directionFacing,prevDirection,command);
            }
            if(command.equals("u")){
                prevDirection=directionFacing;
                directionFacing='U';
            }
            if(command.equals("d")){
                prevDirection=directionFacing;
                directionFacing='D';
            }
        }
        return coordinates;
    }

    private static char setDirection(char directionFacing,char prevDirection, String command){
        if(command=="f"||command=="b")
            return directionFacing;
        if(directionFacing=='N'){
            if (command=="l"){
                directionFacing='W';
            }
            if(command=="r"){
                directionFacing='E';
            }
            if(command=="u"){
                directionFacing='U';
            }
            if(command=="d"){
                directionFacing='D';
            }
        }

        if(directionFacing=='S'){
            if (command=="l"){
                directionFacing='E';
            }
            if(command=="r"){
                directionFacing='W';
            }
            if(command=="u"){
                directionFacing='U';
            }
            if(command=="d"){
                directionFacing='D';
            }
        }

        if(directionFacing=='E'){
            if (command=="l"){
                directionFacing='N';
            }
            if(command=="r"){
                directionFacing='S';
            }
            if(command=="u"){
                directionFacing='U';
            }
            if(command=="d"){
                directionFacing='D';
            }
        }

        if(directionFacing=='W'){
            if (command=="l"){
                directionFacing='S';
            }
            if(command=="r"){
                directionFacing='N';
            }
            if(command=="u"){
                directionFacing='U';
            }
            if(command=="d"){
                directionFacing='D';
            }
        }
        if(directionFacing=='U'){
            if(prevDirection=='N'){
                if (command=="l"){
                    directionFacing='W';
                }
                if(command=="r"){
                    directionFacing='E';
                }
                if(command=="u"){
                    directionFacing='U';
                }
                if(command=="d"){
                    directionFacing='N';
                }
            }
            if(prevDirection=='E'){
                if (command=="l"){
                    directionFacing='N';
                }
                if(command=="r"){
                    directionFacing='S';
                }
                if(command=="u"){
                    directionFacing='U';
                }
                if(command=="d"){
                    directionFacing='E';
                }
            }
            if(prevDirection=='W'){
                if (command=="l"){
                    directionFacing='S';
                }
                if(command=="r"){
                    directionFacing='N';
                }
                if(command=="u"){
                    directionFacing='U';
                }
                if(command=="d"){
                    directionFacing='W';
                }
            }
            if(prevDirection=='S'){
                if (command=="l"){
                    directionFacing='E';
                }
                if(command=="r"){
                    directionFacing='W';
                }
                if(command=="u"){
                    directionFacing='U';
                }
                if(command=="d"){
                    directionFacing='S';
                }
            }
        }

        if(directionFacing=='D') {
            if (prevDirection == 'N') {
                if (command == "l") {
                    directionFacing = 'W';
                }
                if (command == "r") {
                    directionFacing = 'E';
                }
                if (command == "u") {
                    directionFacing = 'N';
                }
                if (command == "d") {
                    directionFacing = 'D';
                }
            }
            if (prevDirection == 'E') {
                if (command == "l") {
                    directionFacing = 'N';
                }
                if (command == "r") {
                    directionFacing = 'S';
                }
                if (command == "u") {
                    directionFacing = 'E';
                }
                if (command == "d") {
                    directionFacing = 'D';
                }
            }
            if (prevDirection == 'W') {
                if (command == "l") {
                    directionFacing = 'S';
                }
                if (command == "r") {
                    directionFacing = 'N';
                }
                if (command == "u") {
                    directionFacing = 'W';
                }
                if (command == "d") {
                    directionFacing = 'D';
                }
            }
            if (prevDirection == 'S') {
                if (command == "l") {
                    directionFacing = 'E';
                }
                if (command == "r") {
                    directionFacing = 'W';
                }
                if (command == "u") {
                    directionFacing = 'S';
                }
                if (command == "d") {
                    directionFacing = 'D';
                }
            }
        }
        return directionFacing;
    }

}
