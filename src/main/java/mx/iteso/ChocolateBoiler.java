package mx.iteso;


public abstract class ChocolateBoiler {

        protected boolean empty;
        protected boolean boiled;

        public void fill() {
            if (isEmpty()) {
                empty = false;
                boiled = false;
            }
        }
        public void drain() {
            if (!isEmpty() && isBoiled()) {
                empty = true;
            }
        }
        public void boil() {
            if (!isEmpty() && !isBoiled()) {
                boiled = true;
            }
        }
        public boolean isEmpty() {
            return empty;
        }
        public boolean isBoiled() {
            return boiled;
        }
}

