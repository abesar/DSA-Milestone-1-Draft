import java.util.Arrays;

public class Stocks
{
  public static void main (String[] args)
  {
    Find find = new Find ();
    Sort sort = new Sort ();
    Create create = new Create ();
    Delete delete = new Delete ();

    String[] Brand = {
      "Honda", "Kawasaki", "Kymco", "Yamaha", "Suzuki",
    };
    /** Print all brand */
  }
}

class Find
{
  public String
  findBrandByName (String brandname, String[] brandsArray)
  {
    for (String get : brandsArray)
      {
        if (get.equals (brandname))
          {
            return get;
          }
      }
    return "Not Found";
  }
}

class Sort
{
  public String[] sortBrandByName (String[] brandsArray)
  {
    //  Sorted the array via Arrays.sort
    Arrays.sort (brandsArray);
    String[] sorted = new String[brandsArray.length];
    int index = 0;
    for (String get : brandsArray)
      {
        sorted[index] = get;
        index++;
      }
    return sorted;
  }
}

class Create
{
  public String[] insertBrandByName (String carBrand, String[] brandsArray)
  {

    int incrementThePreviousBrandsArrayLength = brandsArray.length + 1;
    String[] updatedBrandsArray
        = new String[incrementThePreviousBrandsArrayLength];
    int index = 0;
    while (index < incrementThePreviousBrandsArrayLength)
      {

        if (index + 1 == incrementThePreviousBrandsArrayLength)
          {
            updatedBrandsArray[index] = carBrand;
            break;
          }

        updatedBrandsArray[index] = brandsArray[index];
        index++;
      }
    return updatedBrandsArray;
  }
}

// TODO: 4/4/2023 DELETE METHOD IS DON'T GIVE RESULT PROPERLY
class Delete
{
  public String[] deleteBrandbyName (String deleteThisBrand,
                                     String[] brandsArray)
  {
    int index = 0;
    int removeOneIndex = brandsArray.length - 1;

    for (String getValue : brandsArray)
      {
        if (deleteThisBrand.equals (getValue))
          {
            brandsArray[index] = "deleteThisBrand";
          }
        index++;
      }
    // set zero to reuse the index.
    index = 0;
    String[] updatedBrandsArray = new String[removeOneIndex];
    System.out.println ("The length of updatedbrands array is "
                        + updatedBrandsArray.length);

    while (index < removeOneIndex)
      {
        if (brandsArray[index].equals ("deleteThisBrand"))
          {
            index++;
            //                System.out.println("@if"+index + " = " +
            //                brandsArray[index]);
          }
        else
          {
            updatedBrandsArray[index] = brandsArray[index];
            index++;
            //                System.out.println("@else"+index  + " = " +
            //                brandsArray[index]);
          }
        //            System.out.println("Null @ " + brandsArray[index]);
      }
    return updatedBrandsArray;
  }
}
