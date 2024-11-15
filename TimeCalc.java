public class TimeCalc {
    public static void main(String[] args) {
        // recieve data from inputs
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        
        // make calculations
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        
        // creating the output message according to instructions
        String leadingHours = "";
        String leadingMinutes = "";
        if (newHours <= 9){
            leadingHours += "0";
        }
        if (newMinutes <= 9){
            leadingMinutes += "0";
        }
        System.out.println(leadingHours + newHours + ":" + leadingMinutes + newMinutes);
    }
}
