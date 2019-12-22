const patientList = document.getElementById('patient_list');

const outputPatients = (data) =>{
  let html = '';
  data.forEach(doc =>{
    const patient = doc.data();
    const entry = `<li>
    <div id="patient_fname">${patient.First_Name}</div>
    <div id="patient_lname">${patient.Last_Name}</div>
    <div id="patient_email">${patient.Email}</div>
    </li>`;
    html += entry;
    //console.log(patient);
  });
  patientList.innerHTML = html;
}
