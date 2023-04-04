import java.util.Arrays;

public class Stocks
{

  public static void main (String[] args)
  {

    /*
     *  --Demo Execution
     */

    // Initialize the Brands of MotorPH
    String[] Brand
            = { "Honda", "Kawasaki", "Kymco", "Yamaha", "Suzuki", "Samsung" };

    System.out.println ("PRINT ALL BRAND");
    for (String getBrandName : Brand)
    {
      System.out.println (getBrandName);
    }

    System.out.println ("\n\n\n"
            + "Let's try to find the Harley-Davidson");
    String findResult = Find.findBrandByName ("Harley-Davidson", Brand);
    String finalFindResult
            = findResult.equals ("Harley-Davidson") ? "FOUND" : "NOT FOUND";
    System.out.println (finalFindResult);

    System.out.println (
            "Let's add it to the array because it isn't there.\n\n\n");

    String[] harleydavidsonHasBeenAdded
            = Create.insertBrandByName ("Harley-Davidson", Brand);
    System.out.println ("Let's find out if Harley-Davidson is found");
    for (String isItHarleyDavidson : harleydavidsonHasBeenAdded)
    {
      int harleyDavidsonIndex = 0;
      if (isItHarleyDavidson.equals ("Harley-Davidson"))
      {
        System.out.println ("FOUND "+ "😲");
        break;
      }
      else
        System.out.println ("NOTFOUND😔");
      harleyDavidsonIndex++;
    }


    // BreakLine
    System.out.println ("\n\n");

    // It was found🙆!
    System.out.println (
            "Let us now try to delete \"Samsung\" to the array because Samsung is not a Motorcycle Brand");
    String[] samsungRemovedArray
            = Delete.deleteBrandbyName ("Samsung", harleydavidsonHasBeenAdded);
    System.out.print ("\n Check if Samsung removed : ");

    for (String get : samsungRemovedArray)
    {
      System.out.print (get + ",");
    }

    System.out.println("\n\n\n");


  }

  class Find
  {
    /*
     *  Checks the input array to see if the input String is there.
     *  @param brandname The input string
     *  @param brandsArray The input array of string values
     *  @return ? value : Not Found
     */
    public static String
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
    /*  Sort an array by ascending
     *  @param brandsArray The input array of string values
     *  @return - same array, but sorted
     */
    public static String[] sortBrandByName (String[] brandsArray)
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
  /*
   *  Creates an element from the input array and add it to the new Array
   *  @param brandName - The string value to be added from the input to the updated array
   *  @param brandsArray  - The input array of string values
   *  @return - A new string array that includes input string.
   *
   */
    public static String[] insertBrandByName (String brandName,
                                              String[] brandsArray)
    {

      int incrementThePreviousBrandsArrayLength = brandsArray.length + 1;
      String[] updatedBrandsArray
              = new String[incrementThePreviousBrandsArrayLength];
      int index = 0;
      while (index < incrementThePreviousBrandsArrayLength)
      {
        if (index + 1 == incrementThePreviousBrandsArrayLength)
        {
          updatedBrandsArray[index] = brandName;
          break;
        }

        updatedBrandsArray[index] = brandsArray[index];
        index++;
      }
      return updatedBrandsArray;
    }
  }


  class Delete
  {
    /*
     *  Deletes an element from the input array if it matches the specified String
     *  @param deleteThisBrand - The string value to be removed from the input array
     *  @param brandsArray  - The input array of string values
     *  @return - A new string array with the specified value removed, or the
     * original array if the value is not found
     *
     */
    public static String[] deleteBrandbyName (String deleteItem,
                                              String[] brandsArray)
    {
      int i = 0; // Initialize the loop counter variable to 0
      int decrementedBrandArrayLength
              = brandsArray.length - 1; // New Length of the Updated Array

      String[] newVersionArray
              = new String[decrementedBrandArrayLength]; // each element of the
      // array is initialised to
      // null

      // Check if getvalue equals to @deleteItem
      for (String getValue : brandsArray)
      {
        if (deleteItem.equals (getValue))
        {
          brandsArray[i] = "deleteItem";
        }
        i++;
      }
      i = 0;     // set zero to reuse the counter
      int j = 0; //  counter for newVersionArray. This helps to avoid an out
      //  of bounds exception.
      while (i < brandsArray.length)
      {
        if (!brandsArray[i].equals ("deleteItem"))
        {
          newVersionArray[j] = brandsArray[i];
          j++;
        }
        i++;
      }
      return newVersionArray;
    }
  }
}
