import com.github.javafaker.Faker;
import pages.PageInputInformationUser;

import static utils.RegistrationFakeData.randomArray;
import static utils.RegistrationFakeData.randomInteger;

public class FakeData {
    Faker faker = new Faker();
    PageInputInformationUser pageInputInformationUser = new PageInputInformationUser();
    String[] hobbies = {"Sports", "Reading", "Music"};
    String[] gender = {"Male", "Female", "Other"};
    String[] subjects = {"History", "English", "Arts", "Biology", "Commerce"};

    String[] month = {"January", "February ", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    String[] city = {"Delhi", "Gurgaon", "Noida"};

    public void fakeDataForRegistration(){
        String firstNameFake = faker.name().firstName(),
                lastNameFake = faker.name().lastName(),
                userEmailFake = faker.internet().emailAddress(),
                genderWrapperFake = randomArray(gender),
                userNumberFake = "+7" + randomInteger(10000000, 99999999),
                choiceSubjectsFake = randomArray(subjects),
                choiceHobbiesFake = randomArray(hobbies),
                currentAddressInFormFake = faker.address().fullAddress(),
                dayFake = String.valueOf(randomInteger(1, 28)),
                monthFake = randomArray(month),
                yearFake = String.valueOf(randomInteger(1990, 2000));
        String state = "NCR";
        String cityFake = randomArray(city);
    }
}
