class Complex {
    int real;
    int imaginary;
    public Complex(){
        real=0;
        imaginary=0;
    }    
    public Complex(int r,int i){
        this.real=r;
        this.imaginary=i;
    }
    public Complex addComplex(Complex c1){
        Complex c3=new Complex();
        c3.real=c1.real+this.real;
        c3.imaginary=c1.imaginary+this.imaginary;
        return c3;
    }
}
