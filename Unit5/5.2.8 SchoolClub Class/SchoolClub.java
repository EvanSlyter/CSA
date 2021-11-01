public class SchoolClub
{

    private Student leader;
    private String name;
    private int numMembers;

    public SchoolClub(Student leader, String name){
     this.numMembers=0;
    this.leader=new Student(leader.getFirstName(),leader.getLastName(),leader.getGradeLevel(),leader.getSchool());
     this.name=name;
    }
    /* Add your constructor here
     * Constructor should take a leader and club name, then set
     * numMembers to 0.
     */

    public void addMember() {
        numMembers ++;
    }

    public String toString(){
        return leader.getFirstName() + " is the leader of the " + name + " club.";
    }
}
