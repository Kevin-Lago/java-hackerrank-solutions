package object_oriented_programming.java_method_overriding;

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in Soccer Class");
    }
}
