import com.github.javafaker.Faker;
import pages.PageInputInformationUser;

import static utils.RegistrationFakeData.randomArray;
import static utils.RegistrationFakeData.randomInteger;

public class FakeData extends SettingForTest{
    Faker faker = new Faker();
    String[] hobbies = {"Sports", "Reading", "Music"};
    String[] gender = {"Male", "Female", "Other"};
    String[] subjects = {"History", "English", "Arts", "Biology", "Commerce"};

    String[] month = {"January", "February ", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    String[] city = {"Delhi", "Gurgaon", "Noida"};
    String state = "NCR";
    String pictureStatic = "pictures/ToolForm.png";
    String picture = "ToolForm.png";

    String cityFake = randomArray(city);
    String firstNameFake = faker.name().firstName(),
            lastNameFake = faker.name().lastName(),
            userEmailFake = faker.internet().emailAddress(),
            genderWrapperFake = randomArray(gender),
            userNumberFake = String.valueOf(randomInteger(1000000000, 1100000000)),
            choiceSubjectsFake = randomArray(subjects),
            choiceHobbiesFake = randomArray(hobbies),
            currentAddressInFormFake = faker.address().fullAddress(),
            dayFake = String.valueOf(randomInteger(1, 28)),
            monthFake = randomArray(month),
            yearFake = String.valueOf(randomInteger(1990, 2000));

}

