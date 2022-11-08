import java.util.ArrayList;
import java.util.List;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:26 AM
    
    ProjectName: Bai8
*/public class ManagerCard {
    private List<Card> cards;

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }
    // add card
    public void add(Card card){
        this.cards.add(card);
    }
    // delete card
    public boolean delete(String id){
        Card card = this.cards.stream().filter(i-> i.getId().equals(id)).findFirst().orElse(null);
        if(card == null)
            return false;
        this.cards.remove(card);
        return true;
    }
    // show card
    public void showCards(){
        this.cards.forEach(o-> System.out.println(o));
    }

}
