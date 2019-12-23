//Getting a reference to patient data in Firestore.
const patientList = document.getElementById('patient_list');
//Outputs the data to the html page.
const outputPatients = (data) =>{
  let html = '';
  //Cycles through all documents in the collection
  data.forEach(doc =>{
    const patient = doc.data();
    const entry = `<li>
    <div class="fields" id="patient_fname">First Name: ${patient.First_Name}</div>
    <div class="fields" id="patient_lname">Last Name: ${patient.Last_Name}</div>
    <div class="fields" id="patient_email">Email: ${patient.Email}</div>
    <div class="fields" id="patient_history">Medical History:
        <div id="patient_diabetes">Diabetes: ${patient.Medical_History.Diabetes}</div><br>
        <div id="patient_heart">Heart Disease: ${patient.Medical_History.Heart}</div><br>
        <div id="patient_lung">Lung Cancer: ${patient.Medical_History.Lung}</div><br>
    </div>

    </li>`;
    html += entry;
  });
  //output's the data to html page.
  patientList.innerHTML = html;
}
