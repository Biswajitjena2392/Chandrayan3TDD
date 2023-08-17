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
            if(command.equals("l")){
                directionFacing=setDirection(directionFacing,prevDirection,command);
            }
            if(command.equals("r")){
                directionFacing=setDirection(directionFacing,prevDirection,command);
            }
            if(command.equals("u")){
                prevDirection=directionFacing;
                directionFacing=setDirection(directionFacing,prevDirection,command);
            }
            if(command.equals("d")){
                prevDirection=directionFacing;
                directionFacing=setDirection(directionFacing,prevDirection,command);
            }
            if(command.equals("f")){
                coords=moveCyaanForward(coords,directionFacing);
            }
            if(command.equals("b")){
                coords=moveCyaanBackward(coords,directionFacing);
            }

        }
        return coords;
    }

    //Note coords[0] represents Movement in x-axis i.e. East or west
    //coords[1] represents Movement in y-axis i.e. North or Southbound
    //coords[2] represent movement in z-axis i.e. Up or downwards movement
    private static int[] moveCyaanForward(int[] coords, char directionFacing){
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
        return coords;
    }

    private static int[] moveCyaanBackward(int[] coords, char directionFacing){
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
        return coords;
    }

    private static char setDirection(char directionFacing,char prevDirection, String command){
        if(command=="f"||command=="b")
            return directionFacing; //since the direction facing won't change by moving back or forth

        if(directionFacing=='N'){
            directionFacing=setDirectionWhenFacingNorth(directionFacing,command);
        }

        else if(directionFacing=='S'){
            directionFacing=setDirectionWhenFacingSouth(directionFacing,command);
        }

        else if(directionFacing=='E'){
            directionFacing=setDirectionWhenFacingEast(directionFacing,command);
        }

        else if(directionFacing=='W'){
            directionFacing=setDirectionWhenFacingWest(directionFacing,command);
        }
        else if(directionFacing=='U'){
            directionFacing=setDirectionWhenFacingUp(directionFacing,prevDirection,command);
        }

        else if(directionFacing=='D') {
            directionFacing=setDirectionWhenFacingDown(directionFacing,prevDirection,command);
        }
        return directionFacing;
    }

    private static char setDirectionWhenFacingNorth(char directionFacing, String command){
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
        return directionFacing;
    }
    private static char setDirectionWhenFacingSouth(char directionFacing, String command){
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
        return directionFacing;
    }

    private static char setDirectionWhenFacingEast(char directionFacing, String command){
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
        return directionFacing;
    }
    private static char setDirectionWhenFacingWest(char directionFacing, String command){
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
        return directionFacing;
    }

    private static char setDirectionWhenFacingDown(char directionFacing, char prevDirection, String command){
        if(command=="u")
            directionFacing=prevDirection;
        if(command=="d")
            directionFacing='D';
        if (prevDirection == 'N') {
            if (command == "l") {
                directionFacing = 'W';
            }
            if (command == "r") {
                directionFacing = 'E';
            }
        }
        if (prevDirection == 'E') {
            if (command == "l") {
                directionFacing = 'N';
            }
            if (command == "r") {
                directionFacing = 'S';
            }
        }
        if (prevDirection == 'W') {
            if (command == "l") {
                directionFacing = 'S';
            }
            if (command == "r") {
                directionFacing = 'N';
            }
        }
        if (prevDirection == 'S') {
            if (command == "l") {
                directionFacing = 'E';
            }
            if (command == "r") {
                directionFacing = 'W';
            }
        }
        return directionFacing;
    }

    private static char setDirectionWhenFacingUp(char directionFacing, char prevDirection, String command){
        if(command=="u")
            directionFacing='U';
        if(command=="d")
            directionFacing=prevDirection;
        if(prevDirection=='N'){
            if (command=="l"){
                directionFacing='W';
            }
            if(command=="r"){
                directionFacing='E';
            }
        }
        if(prevDirection=='E'){
            if (command=="l"){
                directionFacing='N';
            }
            if(command=="r"){
                directionFacing='S';
            }
        }
        if(prevDirection=='W'){
            if (command=="l"){
                directionFacing='S';
            }
            if(command=="r"){
                directionFacing='N';
            }
        }
        if(prevDirection=='S'){
            if (command=="l"){
                directionFacing='E';
            }
            if(command=="r"){
                directionFacing='W';
            }
        }
        return directionFacing;
    }


}
