const patientList = document.getElementById('patient_list');
const patient_Messages_List = document.getElementById('patient_messages_list');

const outputPatients = (data) =>{
  let html = '';
  data.forEach(doc =>{
    const patient = doc.data();
    const entry = `<li>
    <div id="patient_fname">First Name: ${patient.First_Name}</div>
    <div id="patient_lname">Last Name: ${patient.Last_Name}</div>
    <div id="patient_email">Email: ${patient.Email}</div><br>
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

const outputMessages = (messagedata) =>{
  let html = '';
  messagedata.forEach(doc =>{
    const support = doc.data();
    const entry = `<li>
    <div id="message_content">Message Content: ${support.Content}</div>
    <div id="message_status">Status: ${support.Status}</div>
    <div id="message_nature">Nature of Subject: ${support.Subject}</div><br>
    <div id="message_nature">Sender: ${support.Patient_Email}</div><br>

    </li>`;
    html += entry;
  });
  patient_Messages_List.innerHTML = html;
}
