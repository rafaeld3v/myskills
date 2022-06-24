import React, { useEffect } from 'react';
import { StatusBar } from 'react-native';

import SplashScreen from "react-native-splash-screen";

import Home from './src/screens/Home';

export default function App() {
  useEffect(() => {
    SplashScreen.hide();
  });

  return (
    <>
      <StatusBar barStyle="light-content" />
      <Home />
    </>
  );
}
