package behavioral.interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your question?");

        String questionAsked;
        questionAsked= scanner.nextLine();
        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuantity();

        try {
            Class<?> tempClass = Class.forName(fromConversion);
            Constructor<?> con = tempClass.getConstructor();

            Object convertFrom = (Expression) con.newInstance();

            Class<?>[] methodParams = new Class[]{Double.TYPE};
            Method conversionMethod = tempClass.getMethod(toConversion,methodParams);

            Object[] params = new Object[]{new Double(quantity)};

            String toQuantity = (String) conversionMethod.invoke(convertFrom,params);

            String answerToQues = question.getResponse() + toQuantity + " " + toConversion;
            System.out.println(answerToQues);


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (SecurityException e){
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        scanner.close();
        
    }
}
