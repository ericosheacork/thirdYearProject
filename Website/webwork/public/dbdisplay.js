const patientList = document.getElementById('patient_list');

const outputPatients = (data) =>{
  let html = '';
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
  patientList.innerHTML = html;
}
