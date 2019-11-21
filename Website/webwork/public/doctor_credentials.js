//initialize firebase
var firebaseConfig = {
  apiKey: "AIzaSyCIrRQLlsAzssCKjevk9AwFloPLrWSCfHk",
  authDomain: "mediscreen-674eb.firebaseapp.com",
  databaseURL: "https://mediscreen-674eb.firebaseio.com",
  projectId: "mediscreen-674eb",
  storageBucket: "mediscreen-674eb.appspot.com",
  messagingSenderId: "292545820886",
  appId: "1:292545820886:web:9fe5753b475a2f524b3177",
  measurementId: "G-FCP7TQ40TP"
};
firebase.initializeApp(firebaseConfig);

const auth = firebase.auth();

const signupForm = document.querySelector('#register_form');
signupForm.addEventListener('register', (e) => {

  const email = signupForm['signup_email'].value;
  const password = signupForm['signup_password'].value;

  auth.createUserWithEmailAndPassword(email,password).then(cred =>{
    console.log(cred);
  })
})
