import PersonCard from "./components/PersonCard";
import "./App.css";

function person() {
  return (
    <div className="person">
      <PersonCard
        firstName="Hassan"
        lastName="Odeh"
        age={25}
        hairColor="Black"
      />
      <PersonCard
        firstName="Chandler "
        lastName="Bing"
        age={57}
        hairColor="Brown"
      />
      <PersonCard
        firstName="Rachel"
        lastName="Green"
        age={49}
        hairColor="Blonde"
      />
            <PersonCard
        firstName="Luka"
        lastName="Modric"
        age={36}
        hairColor="Blonde"
      />

    </div>
  );
}

export default person;
