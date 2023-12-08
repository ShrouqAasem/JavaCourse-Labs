import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.toList;



public class Main {
    public static void main(String[] args) throws IOException{
            List<Country> countryList = ReadFromCSVFiles.readCountriesFromFile("C:\\Users\\Dell\\Desktop\\java iti\\lab 5\\Lab 5 B\\Lab5_doc\\Countries.csv");
            List<City> cityList = ReadFromCSVFiles.readCitiesFromFile("C:\\Users\\Dell\\Desktop\\java iti\\lab 5\\Lab 5 B\\Lab5_doc\\Cities.csv");
            Optional<City> cityForEachCountry;
            // highest populated city of each country
        System.out.println("-------------------------------------------First Task-----------------------------------------------------------");
            for(Country country : countryList){
                cityForEachCountry = cityList
                        .stream()
                        .filter(city -> city.getCountryCode()
                                .trim()
                                .equals(country.getCode()))
                        .max(Comparator.comparingInt(City::getPopulation));
                cityForEachCountry.ifPresent(System.out::println);
            }

        System.out.println("-------------------------------------------Second Task-----------------------------------------------------------");
        //most populated country of each continent

        List<String > continents;
        continents = countryList
                .stream()
                .map(Country::getContinent)
                .distinct()
                .collect(toList());
        //System.out.println(continents);

        Optional<Country> countryForEachContinent;

        for(String str : continents){
            countryForEachContinent = countryList
                    .stream()
                    .filter(country -> country.getContinent()
                            .trim()
                            .equals(str))
                    .max(Comparator.comparingInt(Country::getPopulation));
            countryForEachContinent.ifPresent(System.out::println);
        }

        System.out.println("-------------------------------------------Third Task-----------------------------------------------------------");
            //highest populated capital city
            List<Integer> capitalCities = countryList
                    .stream()
                    .map(Country::getCapital)
                    .collect(toList());
            //System.out.println(capitalCities);
            Optional<City> capitalCity;
            List<City> existedCapitalCities = new ArrayList<>();
            for(Integer i : capitalCities){
                capitalCity = cityList
                        .stream()
                        .filter(city -> city.getId()==i)
                        .max(Comparator.comparingInt(City::getPopulation));
                //System.out.println(capitalCity);
                capitalCity.ifPresent(existedCapitalCities::add);
            }
        System.out.println(existedCapitalCities);
            String highestPopulatedCapitalCity = existedCapitalCities
                    .stream()
                    .max(Comparator.comparingInt(City::getPopulation))
                    .toString();
            System.out.println(highestPopulatedCapitalCity);
    }

}