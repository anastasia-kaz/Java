public class EmployeeHelper {

    //поиск сотрудника в массиве по его имени
    public static Employee findByName(String name, Employee[] array){
        for(int i = 0; i < array.length; i++){
            if (name.equals(array[i].getName())){
            return array[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findSubName(String subname, Employee[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i].getName().contains(subname)){
                return array[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getSumSalary(Employee[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i].salary;
        }
        return sum;
    }

    //поиск наименьшей зарплаты в массиве
    public static int getMinSalary(Employee[] array){
        int min = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].getSalary() < min){
                min = array[i].getSalary();
            }
        }
        return min;
    }

    //поиск наибольшей зарплаты в массиве
    public static int getMaxSalary(Employee[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].getSalary() > max){
                max = array[i].getSalary();
            }
        }
        return max;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров







}
