'use client';
import React from 'react';
import { ReactElement } from "react";
import HomeOutlinedIcon from '@mui/icons-material/HomeOutlined';
import Grid from '@mui/material/Grid';
import Link from 'next/link';
import Paper from '@mui/material/Paper';
import Typography from '@mui/material/Typography';
import { observer } from 'mobx-react-lite';
function Footer({ onNavigation, route }: any): ReactElement {
    return (

        <footer>
            <Paper sx={{ position: 'fixed', bottom: 0, left: 0, right: 0, color: '#000' }} elevation={3} >
                <Grid container
                    direction={'row'} justifyContent={'center'} alignItems={'center'}
                    sx={{ height: '5em' }}>
                    <Grid>
                        <Link className={'col-flex align-center bg-primary-black full-width no-text-decoration'} href='landing' onClick={() => onNavigation('landing')}>
                            <HomeOutlinedIcon color={route === 'landing' ? 'primary' : 'error'} />
                        </Link>
                    </Grid>
                </Grid>
            </Paper>
        </footer>

    );
}

export default observer(Footer);