public class Operation extends Calculator{

    @Override
    public void setX(double x) {
        super.x = x;
    }

    @Override
    public void setY(double y) {
        super.y = y;
    }

    @Override
    public double sum() {
        return x + y;
    } 

    @Override
    public double diff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diff'");
    }

    @Override
    public double mult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mult'");
    }

    @Override
    public double div() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'div'");
    }

    @Override
    public double extent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'extent'");
    }
    
}
