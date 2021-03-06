package cards;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Shoe implements Queue<Card>{
	private List<Card> qCards;
	private Integer mCount;

	public Shoe(int numDecks) {
		qCards = new LinkedList<Card>();
		for(int i = 0; i < numDecks; i++) {
			Deck deck = new Deck();
			deck.shuffle();
			while(!deck.empty()){
				qCards.add(deck.draw());
			}
		}
		mCount = 0;
		// Re-shuffle our shuffled cards.
		Collections.shuffle(qCards);
	}
	
	public Card draw() {
		Card lCard = qCards.remove(0);
		updateCount(lCard);
		return lCard;
	}

	public void burn() {
		updateCount(qCards.remove(0));
	}
	
	public Integer getCount() {
		return mCount/((qCards.size()/52)+1);
	}
	
	public boolean empty() {
		//return !(mCards.size() > 0);
		return !(qCards.size() > 0);
	}
	
	private void updateCount(Card card) {
		if(card.getValue() <= 6 && card.getValue() >= 2) {
			mCount += 1;
		} else if (card.getValue() >= 10 || card.getValue() == 1) {
			mCount -= 1;
		}
	}

	@Override
	public boolean addAll(Collection<? extends Card> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Card e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Card element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(Card e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Card peek() {
		System.out.println("Next card value is: " + qCards.get(0).getValue());
		return null;
	}

	@Override
	public Card poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
