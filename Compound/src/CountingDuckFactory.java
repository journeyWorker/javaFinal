
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Client createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Client createRedheadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter( new RedheadDuck()); 
	}
	@Override
	public Client createDuckcall() {
		// TODO Auto-generated method stub
		return new QuackCounter( new DuckCall()); 
	}

	@Override
	public Client createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter( new RubberDuck());
	}

}
