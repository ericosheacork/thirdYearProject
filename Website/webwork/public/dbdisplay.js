const patientList = document.getElementById('patient_list');

const outputPatients = (data) =>{
  let html = '';
  data.forEach(doc =>{
    const patient = doc.data();
    const entry = `<li>
    <div id="patient_fname">First Name: ${patient.First_Name}</div>
    <div id="patient_lname">Last Name: ${patient.Last_Name}</div>
    <div id="patient_email">Email: ${patient.Email}</div><br>
    <div id="patient_email">Medical History: ${patient.Medical_History.Diabetes}</div><br>
    </li>`;
    html += entry;
  });
  patientList.innerHTML = html;
}
