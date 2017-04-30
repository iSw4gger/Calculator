
package mooc;

public class Calculator {
    
        Reader reader = new Reader();
        private int counter = 0;
        int[] array = new int[2];
        
        public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

        private void sum(){
            
            counter++;
            System.out.print("Enter first number: ");
            int num1 = reader.readInt();
            System.out.print("Enter second number ");
            int num2 = reader.readInt();
            
            
            int total = num1 + num2;
            System.out.println("Total: " + total);
            
        }
        
        private void difference(){
            
            counter++;
            System.out.print("Enter first number: ");
            int num1 = reader.readInt();
            System.out.print("Enter second number ");
            int num2 = reader.readInt();
            
            
            int total = num1 - num2;
            System.out.println("Total: " + total);
            
        } 
        
        public void product(){
            
            counter++;            
            helper();
            int sum = 0;
               for(int i = 0; i < array.length; i++){
                  sum = array[0] * array[1];
               }
            
            
            System.out.println("Total: " + sum);
            
        }
        
        public void statistics(){
            
            System.out.println("The number of calculations completed was: " + counter);
            
        }
    
        public int [] helper(){
        
            System.out.print("Enter first number: ");
            int num1 = reader.readInt();
            System.out.print("Enter second number ");
            int num2 = reader.readInt();
            
            array[0] = num1;
            array[1] = num2;
            
            return array;
        }
}

