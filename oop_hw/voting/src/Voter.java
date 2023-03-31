public class Voter extends Person {
    protected Boolean vote;

    public Voter(String name, String surname, Integer passport, Boolean vote) {
        super(name, surname, passport);
        this.vote = vote;
    }

    public Boolean getVote(){
        return vote;
    }
}
