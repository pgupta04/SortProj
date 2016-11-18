import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ZNE45571 on 11/18/16.
 */
public class CustomerSortTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testSort() throws Exception {

        List<Customer> inputList = new ArrayList<Customer>();

        Customer first = new Customer("abc", "First Customer");
        Customer second = new Customer("def", "Second Customer");
        Customer third = new Customer(null, "Third Customer");
        Customer fourth = new Customer(null, "Fourth Customer");
        Customer fifth = new Customer("ace", "Fifth Customer");
        Customer sixth = new Customer("pqr", "Sixth Customer");
        Customer seventh = new Customer("p", null);

        inputList.add(first);
        inputList.add(second);
        inputList.add(third);
        inputList.add(fourth);
        inputList.add(fifth);
        inputList.add(sixth);
        inputList.add(seventh);

        List<Customer> expectedList = new ArrayList<Customer>();

        Customer firstE = new Customer(null, "Fourth Customer");
        Customer secondE = new Customer(null, "Third Customer");
        Customer thirdE = new Customer("abc", "First Customer");
        Customer fourthE = new Customer("ace", "Fifth Customer");
        Customer fifthE = new Customer("def", "Second Customer");
        Customer sixthE = new Customer("p", null);
        Customer seventhE = new Customer("pqr", "Sixth Customer");

        expectedList.add(firstE);
        expectedList.add(secondE);
        expectedList.add(thirdE);
        expectedList.add(fourthE);
        expectedList.add(fifthE);
        expectedList.add(sixthE);
        expectedList.add(seventhE);


        CustomerSort customerSort = new CustomerSort();
        List<Customer> outputList = customerSort.sort(inputList);

        Assert.assertArrayEquals(expectedList.toArray(),outputList.toArray());

    }
}