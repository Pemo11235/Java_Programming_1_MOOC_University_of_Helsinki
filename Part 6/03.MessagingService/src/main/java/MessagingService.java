
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class MessagingService {
    private ArrayList<Message> messList;

    public MessagingService() {
        this.messList =  new ArrayList<>();
    }
    
    public void add(Message message) {
        if(message.getContent().length() <= 280){
            this.messList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.messList;
    }
}
